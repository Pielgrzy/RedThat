package ml.java.redthat.domain.api;

import ml.java.redthat.domain.user.User;
import ml.java.redthat.domain.user.UserDao;
import ml.java.redthat.domain.vote.Vote;
import ml.java.redthat.domain.vote.VoteDao;

import java.time.LocalDateTime;
import java.util.Optional;

public class DiscoveryVoteService {
    private VoteDao voteDao = new VoteDao();
    private DiscoveryVoteMapper voteMapper = new DiscoveryVoteMapper();

    public void addVote(DiscoveryVote vote) {
        Vote voteToSave = voteMapper.map(vote);
        voteDao.save(voteToSave);
    }

    private static class DiscoveryVoteMapper {
        private final UserDao userDao = new UserDao();

        Vote map(DiscoveryVote vote) {
            Optional<User> user = userDao.findByUsername(vote.getUsername());
            return new Vote(
                    user.orElseThrow().getId(),
                    vote.getDiscoveryId(),
                    Vote.Type.valueOf(vote.getType()),
                    LocalDateTime.now()
            );
        }
    }
}
