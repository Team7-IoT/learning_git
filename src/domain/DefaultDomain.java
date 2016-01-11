package domain;

import entity.Entity;

/**
 * ドメインのデフォルト実装。
 *
 * @author naotake
 */
public class DefaultDomain<E extends Entity> implements Domain<E> {

    /** エンティティ */
    private E entity;

    public E getEntity() {
        return entity;
    }

    @Override
    public void setEntity(E entity) {
        this.entity = entity;
    }
}
