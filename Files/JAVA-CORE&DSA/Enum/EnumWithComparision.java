public class EnumWithComparision {
	enum Status{
		RUNNING,LOADING,WAITING,SUCCESS;
	}
	public static void main(String[] args) {
		Status s=Status.WAITING;
		//// 
		// if(s==Status.RUNNING)
		// {
		// 	System.out.println("It's running!");
		// }
		// else if(s==Status.LOADING)
		// {
		// 	System.out.println("Loading!");
		// }
		// else if(s==Status.WAITING)
		// {
		// 	System.out.println("Wait!");
		// }
		// else
		// {
		// 	System.out.println("Done!");
		// }
		//// SWITCH
		// switch(s)
		// {
		//     case RUNNING:
		//     	System.out.println("It's Running!");
		//     	break;
		// 	case LOADING:
		// 		System.out.println("It's Loading!");
		// 		break;
		// 	case WAITING:
		// 		System.out.println("Wait!");
		// 		break;
		// 	default:
		// 		System.out.println("Done!");
		// 		break;
		// }


	}
}