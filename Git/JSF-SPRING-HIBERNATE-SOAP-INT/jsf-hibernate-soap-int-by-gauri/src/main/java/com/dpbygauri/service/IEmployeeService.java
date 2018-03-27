package com.dpbygauri.service;

import java.util.List;


import com.dpbygauri.primefaces.model.Employee;

public interface IEmployeeService {
     List<Employee> getAllArticles();
     Employee getArticleById(long articleId);
     boolean addArticle(Employee employee);
     void updateArticle(Employee employee);
     void deleteArticle(Employee employee);
}