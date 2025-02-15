package Clases;
// Generated 03-mar-2020 18:15:16 by Hibernate Tools 4.3.1



/**
 * Friend generated by hbm2java
 */
public class Friend  implements java.io.Serializable {


     private FriendId id;
     private User userByIdUserOrig;
     private User userByIdUserDest;
     private Integer acceptRequest;

    public Friend() {
    }

	
    public Friend(FriendId id, User userByIdUserOrig, User userByIdUserDest) {
        this.id = id;
        this.userByIdUserOrig = userByIdUserOrig;
        this.userByIdUserDest = userByIdUserDest;
    }
    public Friend(FriendId id, User userByIdUserOrig, User userByIdUserDest, Integer acceptRequest) {
       this.id = id;
       this.userByIdUserOrig = userByIdUserOrig;
       this.userByIdUserDest = userByIdUserDest;
       this.acceptRequest = acceptRequest;
    }
   
    public FriendId getId() {
        return this.id;
    }
    
    public void setId(FriendId id) {
        this.id = id;
    }
    public User getUserByIdUserOrig() {
        return this.userByIdUserOrig;
    }
    
    public void setUserByIdUserOrig(User userByIdUserOrig) {
        this.userByIdUserOrig = userByIdUserOrig;
    }
    public User getUserByIdUserDest() {
        return this.userByIdUserDest;
    }
    
    public void setUserByIdUserDest(User userByIdUserDest) {
        this.userByIdUserDest = userByIdUserDest;
    }
    public Integer getAcceptRequest() {
        return this.acceptRequest;
    }
    
    public void setAcceptRequest(Integer acceptRequest) {
        this.acceptRequest = acceptRequest;
    }




}


