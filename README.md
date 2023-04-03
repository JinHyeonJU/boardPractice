#Development Environment
1. IDE: IntelliJ IDEA Community
2. Spring Boot 2.6.14
3. JDK 11
4. mysql
5. Spring Data JPA
6. Thymeleaf

#Board Function
1. Board Write(/board/save)
2. Board List(/board/)
3. Board Detail List(/board/{id})
4. Board Update(/board/update/{id})
    - Click the Edit button on the detail llist
    - Displays the edit with the information of the list on the server
    - title, contents modify
5. Board Delete(/board/delete/{id})
6. Paging(/board/paging)
    - /board/paging?page=2
    - if board data 14
      - 1page 5 => 3pages
      - 1page 3 => 5pages