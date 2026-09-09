package com.github.aunkerrr.repositoryspringboottry.repository.bookSpec;


import com.github.aunkerrr.repositoryspringboottry.model.Book;
import com.github.aunkerrr.repositoryspringboottry.repository.spec.SpecificationProvider;
import com.github.aunkerrr.repositoryspringboottry.repository.spec.SpecificationProviderManager;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookSpecificationProviderManager implements SpecificationProviderManager<Book> {
    private final List<SpecificationProvider<Book>> bookSpecificationProviders;

    @Override
    public SpecificationProvider<Book> getSpecificationProviderManager(String key) {
        return bookSpecificationProviders.stream()
                .filter(p -> p.getKey().equals(key))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Can't find correct specification"
                        + " for key " + key));
    }
}
