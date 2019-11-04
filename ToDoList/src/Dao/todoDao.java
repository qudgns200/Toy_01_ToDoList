package Dao;

import java.util.HashMap;
import java.util.List;

import Model.todo;

public interface todoDao {
	public int insertTodo(todo todo);
	public int updateTodo(HashMap<String, Integer> map);
	public List<todo> selectAll();
}
