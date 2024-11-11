class Solution {
    public int findCircleNum(int[][] grid) {
        boolean[] visited = new boolean[grid.length];
        int c=0;
        for(int i=0;i<grid.length;i++) {
            if(!visited[i]) {
                bfs(i,grid,visited);
                c++;
            }
        }
        return c;
    }

    private void bfs(int s,int[][] grid,boolean[] visited) {
        visited[s]=true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while(!queue.isEmpty()) {
            int j = queue.poll();
            for(int i=0;i<grid[j].length;i++) {
                if(!visited[i] && grid[j][i]==1) {
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }
    }
}



class Solution {
    public int findCircleNum(int[][] grid) {
        boolean[] visited = new boolean[grid.length];
        int c=0;
        for(int i=0;i<grid.length;i++) {
            if(!visited[i]) {
                dfs(i,grid,visited);
                c++;
            }
        }
        return c;
    }

    private void dfs(int j,int[][] grid,boolean[] visited) {
        visited[j]=true;
        for(int i=0;i<grid[j].length;i++) {
            if(!visited[i] && grid[j][i]==1) {
                dfs(i,grid,visited);
            }
        }
    }
    
}