package com.distributedMemeory.cache.HazelCast;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.XmlClientConfigBuilder;
import com.hazelcast.client.util.RoundRobinLB;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.config.ListenerConfig;
import com.hazelcast.config.XmlConfigBuilder;
import com.hazelcast.core.Cluster;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.Member;
import com.hazelcast.core.MembershipListener;
import com.hazelcast.core.ReplicatedMap;
import com.hazelcast.security.Credentials;
import com.hazelcast.security.UsernamePasswordCredentials;

public class HazelCastClient {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		ClientConfig clientConfig = new ClientConfig();
		
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);

		RoundRobinLB roundRobinLB = new RoundRobinLB();
		Cluster cluster = client.getCluster();
		//Set LoadBalancer to RoundRobin instead of Random.
		clientConfig.setLoadBalancer(roundRobinLB);
		roundRobinLB.init(cluster, clientConfig);

		ReplicatedMap<String, String> tnmap = client.getReplicatedMap("emergency_tns");
		int index = 0;

		tnmap.destroy();
		while (++index <= 10) {
			Member nextMember = roundRobinLB.next();
			//if you want to verify HazelCast instance .. 
			System.out.println("this member is : " + roundRobinLB.toString());
			String tn = Integer.toString(index);
			String other_tn = "111-222-333";			
			tnmap.put(tn, "user", 1L, TimeUnit.MINUTES);
			System.out.println("nextMember is : " + nextMember.toString());
		}
	}
}
