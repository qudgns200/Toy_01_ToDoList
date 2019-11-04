package Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.todo;
import Dao.todoDao;

@Service
public class todoServiceImpl implements todoService {

	@Autowired
	private todoDao todoDao;
	
	@Override
	public int insertTodo(todo todo) {
		// TODO Auto-generated method stub
		return todoDao.insertTodo(todo);
	}

	@Override
	public int updateTodo(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		return todoDao.updateTodo(map);
	}

	@Override
	public List<todo> selectAll() {
		// TODO Auto-generated method stub
		return todoDao.selectAll();
	}

	
}
