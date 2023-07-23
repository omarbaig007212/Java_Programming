//// Not Type Safe
// public class Box{
// 	Object container;
// 	Box(Object container)
// 	{
// 		this.container = container;
// 	}

// 	public Object getContainer()
// 	{
// 		return container;
// 	}
// }

//Type Safe
public class Box<T>{
	T container;
	Box(T container)
	{
		this.container = container;
	}

	public T getContainer()
	{
		return container;
	}

	public Object getType()
	{
		if(container instanceof String)
		{
			System.out.println("He");
		}
		return container.getClass().getName();
	}
}