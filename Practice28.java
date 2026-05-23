package JavaPrograms;

public class Practice28 {

	public static void main(String[] args) {

		        int[] arr = {1, 2, 4, 3, 5, 6, 7, 1};
		        boolean[] visited = new boolean[arr.length];
		        System.out.println("Duplicate elements:");
		        for (int i = 0; i < arr.length; i++) {
		            if (visited[i]) 
		            	continue;
                 int count = 1;
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    count++;
		                    visited[j] = true;
		                }
		            }

		            if (count > 1) {
		                System.out.println(arr[i] + " → occurs " + count + " times");
		            }
		        }
		    }
		}

