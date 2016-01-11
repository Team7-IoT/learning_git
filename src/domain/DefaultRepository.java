package domain;

import entity.Entity;

/**
 * リポジトリのデフォルト実装。
 *
 * @author naotake
 */
public class DefaultRepository<E extends Entity, D extends Domain<E>> implements Repository {

    private static final String DOMAIN_NAME_PREFIX = "domain.";

    private static final String DOMAIN_NAME_SUFFIX = "Domain";

    @SuppressWarnings("unchecked")
    public D createDomain(E entity) {
        D domain = null;
        try {
            domain = (D) Class.forName(composeDomainName(entity)).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            try {
                domain = (D) Class.forName(composeDomainName(entity.getClass().getSuperclass()))
                        .newInstance();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
                e1.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        domain.setEntity(entity);
        return domain;
    }

    private String composeDomainName(Entity entity) {
        return composeDomainName(entity.getClass());
    }

    private String composeDomainName(Class<?> clazz) {
        return DOMAIN_NAME_PREFIX + clazz.getSimpleName() + DOMAIN_NAME_SUFFIX;
    }
}
