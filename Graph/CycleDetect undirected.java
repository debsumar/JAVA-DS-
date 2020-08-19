//Undirected Graph

class DetectCycle
{
	static boolean isCyclic(ArrayList<ArrayList<Integer>>g,int v)
	{
		//add your code here
		boolean visited[] = new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				if(isCyclicUtil(g,i,visited,-1)) return true;
			}
		}
		return false;
	}
	static boolean isCyclicUtil(ArrayList<ArrayList<Integer>>g,int src,boolean visited[],int parent)
	{
		visited[src]=true;
		for(Integer x:g.get(src))	//Getting neighbours of x
		{
			if(!visited[x])
			{
				if(isCyclicUtil(g,x,visited,src)) return true;
			}
			else	//Neighbourhood already visited
			{
				if(x!=parent) return true;	//Neighbour not parent means cycle
			}
		}
		return false;
	}
}