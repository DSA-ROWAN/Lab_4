import java.util.EmptyStackException;

public class Stack<T> {
	List<T> lst = new LinkedList<T>();
	
	public Stack(){
		
	}
	
	public void push(T item)throws Exception{
		lst.add(0, item);
	}
	
	public T pop() throws EmptyStackException{
		if(!lst.isEmpty()){
			return lst.removeAt(0);
		}else{
			throw new EmptyStackException();
		}
	}
	
	public List<T> popAll(){
		return lst.subList(1, lst.size());
	}
	
	public int size(){
		lst.size();
		return 0;
	}
	
	public boolean isEmpty(){
		lst.isEmpty();
		return true;
	}
	
	void clear(){
		lst.clear();
	}
	
	public T peek() throws EmptyStackException{
		if(!lst.isEmpty()){
			return lst.get(0);
		}else{
			throw new EmptyStackException();
		}
	}
}
