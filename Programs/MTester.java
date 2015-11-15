public class MTester 
{
	public static void main(String[] args)
	{
		MFolder root = MBuild.genList();
		print(root,0);
	}
	
	private static void print(MItem item, int level)
	{
		if(item.isFile())
		{
			for(int i = level; i > 0; i--)
				System.out.println("\t");
			System.out.println(item.path());
		}
		else if(item.isFolder())
		{
			for(int i = level; i > 0; i--)
				System.out.println("\t");
			System.out.println(item.path());
			for(MItem itm: ((MFolder)item).contents())
				print(itm, level+1);
		}
	}
}
