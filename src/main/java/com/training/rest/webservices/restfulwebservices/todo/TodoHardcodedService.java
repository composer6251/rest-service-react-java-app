package com.training.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
This Class acts as a database for db calls prior to create of db.
 */
@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "David", new Date(), "Learn React", false ));
        todos.add(new Todo(++idCounter, "David", new Date(), "Master React", false ));
        todos.add(new Todo(++idCounter, "David", new Date(), "Meet Jesus", false ));
    }

    public List<Todo> findAllTodos(){
        return todos;
    }

    public Todo saveTodo(Todo todo){
        if(todo.getId() == -1){
            todo.setId(++idCounter);
            todos.add(todo);
        }
        else{
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo deleteById(long id){
        Todo todo = findById(id);
        if(todo == null) return null;
        if(todos.remove(todo)){
            return todo;
        }
        return null;
    }

    public Todo findById(long id){
        for(Todo todo : todos){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }
}
