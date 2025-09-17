package practice.problems.Graphs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BreadthFirstApproach {

    public void executeBreadthFirstApproach() {
        int[][] adj = new int[][]{{1,2},{0,2,3},{0,4},{1,4},{2,3}};
        ArrayList<ArrayList<Integer>> list =
                Arrays.stream(adj)
                        .map(row -> IntStream.of(row).boxed()
                                .collect(Collectors.toCollection(ArrayList::new)))
                        .collect(Collectors.toCollection(() -> new ArrayList<>(adj.length)));
        System.out.println("Input List: "+list);
        BreadthFirstApproach graph = new BreadthFirstApproach();
        System.out.println("Output: "+ bfs(list));

    }

    private static ArrayList<Integer>bfs(ArrayList<ArrayList<Integer>> arr){
        int V = arr.size();
        int s = 0;
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            for(int x: arr.get(curr)){
                if(!visited[x]){
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        return res;
    }
}
