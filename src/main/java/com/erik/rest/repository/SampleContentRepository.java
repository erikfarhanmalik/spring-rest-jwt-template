package com.erik.rest.repository;

import com.erik.rest.entity.SampleContent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "sampleContent", path = "sample-contents")
public interface SampleContentRepository extends PagingAndSortingRepository<SampleContent, Long> {

}
