package Generics2;

public interface IEntityRepository<T extends IEntity> {

    void add(T entity);
    void delete(T entity);
    void update(T entity);

}
/*
implements yerine extends yazmalısın
 */
