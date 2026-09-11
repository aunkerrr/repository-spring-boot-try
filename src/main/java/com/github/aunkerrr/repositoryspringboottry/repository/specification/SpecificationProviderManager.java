package com.github.aunkerrr.repositoryspringboottry.repository.specification;

public interface SpecificationProviderManager<T> {
    SpecificationProvider<T> getSpecificationProviderManager(String key);
}
