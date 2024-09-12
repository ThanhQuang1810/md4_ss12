package ra.mvc.dao;

import java.util.List;

public interface IGenericDao<T,E> {
    public List<T> findAll();
    public T findById(E id);
    public void create(T t); // sửa va thêm mơi
    public void update(T t); // sửa va thêm mơi
    public void delete(E id);
}
