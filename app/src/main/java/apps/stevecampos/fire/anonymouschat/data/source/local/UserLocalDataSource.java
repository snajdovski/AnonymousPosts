package apps.stevecampos.fire.anonymouschat.data.source.local;

import apps.stevecampos.fire.anonymouschat.data.source.UserDataSource;
import apps.stevecampos.fire.anonymouschat.main.ui.entity.Comment;
import apps.stevecampos.fire.anonymouschat.main.ui.entity.Message;
import apps.stevecampos.fire.anonymouschat.main.ui.entity.Post;
import apps.stevecampos.fire.anonymouschat.main.ui.entity.User;

/**
 * Created by @stevecampos on 22/11/2017.
 */

public class UserLocalDataSource implements UserDataSource {
    public UserLocalDataSource() {
    }

    @Override
    public void publishPost(Post post, Callback<Post> callback) {

    }

    @Override
    public void getPopularPosts(Callback<Post> callback) {

    }

    @Override
    public void getRecentPosts(Callback<Post> callback) {

    }

    @Override
    public void getPostWithTag(String tag, Callback<Post> callback) {

    }

    @Override
    public void publishComment(Comment comment, Callback<Comment> callback) {

    }

    @Override
    public void getPostComments(Post post, Callback<Comment> callback) {

    }

    @Override
    public void removePostCommentsListener(Post post) {

    }

    @Override
    public void listenUserInboxState(User user, Callback<Boolean> callback) {

    }

    @Override
    public void removeUserInboxStateListener(User user) {

    }

    @Override
    public void getUser(String id, Callback<User> callback) {

    }

    @Override
    public void updateUser(User user, Callback<User> callback) {

    }

    @Override
    public void updateUserCoins(User user, long coins, Callback<User> callback) {

    }

    @Override
    public void updateUserInboxState(User user, boolean state) {

    }

    @Override
    public void updateUserChatInboxState(User user, User receiver, boolean state) {

    }

    @Override
    public void sendMessage(User sender, User receiver, Message message, Callback<Message> callback) {

    }

    @Override
    public void getMessages(String chatId, Callback<Message> callback) {

    }

    @Override
    public void removeMessagesListener(String chatId) {

    }

    @Override
    public void getMessagesFromInbox(User user, Callback<Message> callback) {

    }

    @Override
    public void removeInboxMessageListener(User user) {

    }
}
