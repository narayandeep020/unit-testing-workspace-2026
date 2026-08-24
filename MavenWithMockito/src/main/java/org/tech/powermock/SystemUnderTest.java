package org.tech.powermock;

import java.util.ArrayList;
import java.util.List;

interface Dependency {
	List<Integer> retrieveAllStats();
}

public class SystemUnderTest {

	private Dependency dependency;

	public int methodUsingAnArrayListConstructor() {
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		return list.size();
	}

	public int methodCallingAStaticMethod() {
		List<Integer> stats = dependency.retrieveAllStats();
		long sum = 0;
		for (int stat : stats)
			sum += stat;
		return UtilityClass.staticMethod(sum);
	}

	public long privateMethodUnderTest() {
		List<Integer> stats = dependency.retrieveAllStats();
		long sum = 0;
		for (int stat : stats)
			sum += stat;
		return sum;
	}
}
