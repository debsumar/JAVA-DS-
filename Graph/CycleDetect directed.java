//Directed Graph

class DetectCycle
{
	static boolean isCyclic(ArrayList<ArrayList<Integer>g,int v)
	{
	//add your code here
		boolean visited[] = new boolean[v];
		boolean currentPath[] = new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				if(isCyclicUtil(g,i,visited,currentPath)) return true;
			}
		}
		return false;
	}
	static boolean isCyclicUtil(ArrayList<ArrayList<Integer>>g,int src,boolean visited[],boolean currentPath[])
	{
		visited[src]=true;
		currentPath[src]=true;
		for(Integer x:g.get(src))	//Getting neighbours of x
		{
			if(!visited[x])
			{
				if(isCyclicUtil(g,x,visited,currentPath)) return true;
			}
			else	//Neighbourhood already visited
			{
				if(currentPath[x]==true)
				{
					 return true;	//Visited and in current path
				}
			}
		}
		currentPath[src] = false;
		return false;
	} 
}