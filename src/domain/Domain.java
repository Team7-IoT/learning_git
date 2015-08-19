package domain;

import entity.Entity;

/**
 * ドメインを表すインタフェース。
 *
 * @author naotake
 */
public interface Domain<E extends Entity> {

    public void setEntity(E entity);
}
