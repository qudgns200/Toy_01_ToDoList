package Service;

import java.util.HashMap;
import java.util.List;

import Model.todo;

public interface todoService {
	
	public int insertTodo(HashMap<String, String> map);
	public int updateTodo(HashMap<String, Integer> map);
	public List<todo> selectAll();
}
