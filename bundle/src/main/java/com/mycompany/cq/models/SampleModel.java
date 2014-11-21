package com.mycompany.cq.models;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import com.day.cq.wcm.api.Page;

@Model(adaptables = { SlingHttpServletRequest.class, Resource.class })
public class SampleModel
{

    @Inject
    private Page resourcePage;     
    

    public Page getResourcePage() {
        return this.resourcePage;
    }
}