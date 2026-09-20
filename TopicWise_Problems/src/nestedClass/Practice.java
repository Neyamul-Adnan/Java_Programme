package nestedClass;

public class Practice {
	
	int outVar;
	int x = 25;
	
	public Practice(int outVar) {
		this.outVar=outVar;
	}
	
	public void print() {
		System.out.println(outVar);
	}
	
	class InnerClass{
		int innVar;
		int x = 15;
		
		public InnerClass(int innVar) {
			this.innVar=innVar;
		}
		public void print(int x) {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(innVar);
			
			System.out.println(Practice.this.outVar);
			System.out.println(Practice.this.x);
			
		}
	}
	
	static class StaticClass{
		static int stVar;
		
		public StaticClass(int stVar) {
			this.stVar=stVar;
		}
		
		public static void print() {
			System.out.println(stVar);
		}
	}

}
