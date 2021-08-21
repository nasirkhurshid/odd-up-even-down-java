import java.util.*;
public class oddUpEvenDown {
	static Vector<Integer> oddupevendown(Vector<Integer> arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr.size();j++) {
				if(arr.get(j)%2 == 0) {
					arr.set(j, arr.get(j)-2);
				}
				else {
					arr.set(j, arr.get(j)+2);
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Vector<Integer> arr = new Vector<Integer>(5);
		arr.add(3);
		arr.add(4);
		arr.add(9);
		System.out.println("Old array:");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)+"\t");
		}
		arr = oddupevendown(arr,3);
		System.out.println("New array:");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)+"\t");
		}
	}

}
