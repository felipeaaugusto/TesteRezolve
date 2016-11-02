package com.testRezolve.java;
import java.util.ArrayList;
import java.util.List;

public class TheFrog {

	public static List<List<String>> ways = new ArrayList<List<String>>();

	public static void main(String[] args) {
		jumpWays(3);
		printWays(ways);
	}

	public static void jumpWays(int distance) {
		List<String> way = new ArrayList<String>();
		jumpWays(way, 0, distance);
	}

	public static void jumpWays(List<String> way, int currentDistance, int distance) {
		List<String> currentWay = new ArrayList<String>();
		if (currentDistance < distance) {
			currentWay.addAll(way);
			currentWay.add("Step");
			jumpWays(currentWay, currentDistance + 1, distance);
			currentWay = new ArrayList<String>();

			currentWay.addAll(way);
			currentWay.add("Jump");
			jumpWays(currentWay, currentDistance + 2, distance);
		}

		if (currentDistance == distance) {
			ways.add(way);
			return;
		}

		if (currentDistance > distance) {
			return;
		}
	}

	public static void printWays(List<List<String>> ways) {
		for (List<String> way : ways) {
			System.out.println(way.toString());
		}
	}

}