package Abstract;

import Entities.Member;

public interface BaseService<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	

}
