package practice.problems.Graphs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DepthFirstApproach {

    public void executeDepthFirstApproach(){
//        int[][] adj = new int[][]{{1,2},{0,2},{0,1,3,4},{2},{2}};
        int[][] adj = new int[][]{{2,3,1},{0},{0,4},{0},{2}};
        ArrayList<ArrayList<Integer>> list =
                Arrays.stream(adj)
                        .map(row -> IntStream.of(row).boxed()
                                .collect(Collectors.toCollection(ArrayList::new)))
                        .collect(Collectors.toCollection(() -> new ArrayList<>(adj.length)));
        System.out.println("Input List: "+list);
        System.out.println("Output: "+dfs(list));
    }

    private static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> arr){
        int V = arr.size();
        int s = 0;
        boolean[] visited = new boolean[V];
        visited[s] = true;
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(s);
        while (!deque.isEmpty()){
            int curr = deque.pop();
            res.add(curr);
            for(int i:arr.get(curr)){
                if(!visited[i]){
                    visited[i]=true;
                    deque.add(i);
                }
            }
        }
        return res;
    }
}
