package com.github.aunkerrr.repositoryspringboottry.repository.spec;

public interface SpecificationProviderManager<T> {
    SpecificationProvider<T> getSpecificationProviderManager(String key);
}
