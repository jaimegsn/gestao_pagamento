package com.gestaopagamentos.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String email;
    private String username;
    private String password;
    private List<FinancePlanning> financePlanningList = new ArrayList<>();
}
