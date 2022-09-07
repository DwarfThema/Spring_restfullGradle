package com.greedy.restfullgradle.repository;

import com.greedy.restfullgradle.dto.UserDTO;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    //db 연동 코드..!
    //JPA를 이용한 DB 연동

    static public ArrayList<UserDTO> users;

    static {
        users = new ArrayList<>();
        users.add(new UserDTO("dwarfthema","1","1234"));
        users.add(new UserDTO("pickle","2","1234"));
        users.add(new UserDTO("vivle","3","1234"));
        //강제로 생성
    }

    public UserDTO insertUser(UserDTO user) {
        users.add(user);
        //강제로 생성한 값을 넣기
        return user;
    }

    public List<UserDTO> getAllUsers(){
        //모든 유저의 값을 리턴
        return users;
    }

    public UserDTO getUserByUserId(String userId){
        return users.stream() //clinet 와 비슷
                .filter(userDTO -> userDTO.getUserId().equals(userId)) //userId를 받아서 있는걸 찾아주기 where와 비슷
                .findAny() //findall 과 비슷
                .orElse(new UserDTO("","","")); //없을 경우 빈값을 출력
    }

    public void updateUserPw(String userId, UserDTO user){
        users.stream()
                .filter(userDTO -> userDTO.getUserId().equals(userId))
                .findAny()
                .orElse(new UserDTO("","",""))
                .setUserPw(user.getUserPw());
    }

    public void deleteUser(String userId){
        users.removeIf(userDTO -> userDTO.getUserId().equals(userId));
        //removeIf 를 이용하면 삭제까지 가능하다.
    }
}
