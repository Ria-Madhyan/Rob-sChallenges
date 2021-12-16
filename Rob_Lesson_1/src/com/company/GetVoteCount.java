package com.company;

public class GetVoteCount {
    public static int GetVoteCount (int upVotes, int downVotes){
        int total = upVotes - downVotes;
        System.out.println(total);
        return total;
    }
}
