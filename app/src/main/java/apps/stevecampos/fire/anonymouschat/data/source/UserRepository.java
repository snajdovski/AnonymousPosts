package apps.stevecampos.fire.anonymouschat.data.source;

import android.util.Log;

import apps.stevecampos.fire.anonymouschat.data.source.local.UserLocalDataSource;
import apps.stevecampos.fire.anonymouschat.data.source.remote.UserRemoteDataSource;
import apps.stevecampos.fire.anonymouschat.main.ui.entity.Comment;
import apps.stevecampos.fire.anonymouschat.main.ui.entity.Message;
import apps.stevecampos.fire.anonymouschat.main.ui.entity.Post;
import apps.stevecampos.fire.anonymouschat.main.ui.entity.User;

/**
 * Created by @stevecampos on 22/11/2017.
 */

public class UserRepository implements UserDataSource {

    private static final String TAG = UserRepository.class.getSimpleName();
    private UserLocalDataSource localDataSource;
    private UserRemoteDataSource remoteDataSource;

    public UserRepository(UserLocalDataSource localDataSource, UserRemoteDataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }

    @Override
    public void publishPost(Post post, Callback<Post> callback) {
        localDataSource.publishPost(post, callback);
        remoteDataSource.publishPost(post, callback);
    }

    @Override
    public void getPopularPosts(Callback<Post> callback) {
        localDataSource.getPopularPosts(callback);
        remoteDataSource.getPopularPosts(callback);
    }

    @Override
    public void getRecentPosts(Callback<Post> callback) {
        localDataSource.getRecentPosts(callback);
        remoteDataSource.getRecentPosts(callback);
    }

    @Override
    public void getPostWithTag(String tag, Callback<Post> callback) {
        localDataSource.getPostWithTag(tag, callback);
        remoteDataSource.getPostWithTag(tag, callback);
    }

    @Override
    public void publishComment(Comment comment, Callback<Comment> callback) {
        localDataSource.publishComment(comment, callback);
        remoteDataSource.publishComment(comment, callback);
    }

    @Override
    public void getPostComments(Post post, Callback<Comment> callback) {
        localDataSource.getPostComments(post, callback);
        remoteDataSource.getPostComments(post, callback);
    }

    @Override
    public void removePostCommentsListener(Post post) {
        localDataSource.removePostCommentsListener(post);
        remoteDataSource.removePostCommentsListener(post);
    }

    @Override
    public void listenUserInboxState(User user, Callback<Boolean> callback) {
        Log.d(TAG, "listenUserInboxState");
        remoteDataSource.listenUserInboxState(user, callback);
    }

    @Override
    public void removeUserInboxStateListener(User user) {
        Log.d(TAG, "removeUserInboxStateListener");
        remoteDataSource.removeUserInboxStateListener(user);
    }

    @Override
    public void getUser(String id, Callback<User> callback) {
        localDataSource.getUser(id, callback);
        remoteDataSource.getUser(id, callback);
    }

    @Override
    public void updateUser(User user, Callback<User> callback) {
        Log.d(TAG, "updateUser");
        localDataSource.updateUser(user, callback);
        remoteDataSource.updateUser(user, callback);
    }

    @Override
    public void updateUserCoins(User user, long coins, Callback<User> callback) {
        Log.d(TAG, "updateUserCoins");
        localDataSource.updateUserCoins(user, coins, callback);
        remoteDataSource.updateUserCoins(user, coins, callback);

    }

    @Override
    public void updateUserInboxState(User user, boolean state) {
        Log.d(TAG, "updateUserInboxState");
        remoteDataSource.updateUserInboxState(user, state);
    }

    @Override
    public void updateUserChatInboxState(User user, User receiver, boolean state) {
        Log.d(TAG, "updateUserChatInboxState");
        remoteDataSource.updateUserChatInboxState(user, receiver, state);

    }

    @Override
    public void sendMessage(User sender, User receiver, Message message, Callback<Message> callback) {
        localDataSource.sendMessage(sender, receiver, message, callback);
        remoteDataSource.sendMessage(sender, receiver, message, callback);
    }

    @Override
    public void getMessages(String chatId, Callback<Message> callback) {
        localDataSource.getMessages(chatId, callback);
        remoteDataSource.getMessages(chatId, callback);
    }

    @Override
    public void removeMessagesListener(String chatId) {
        localDataSource.removeMessagesListener(chatId);
        remoteDataSource.removeMessagesListener(chatId);
    }

    @Override
    public void getMessagesFromInbox(User user, Callback<Message> callback) {
        Log.d(TAG, "");
        localDataSource.getMessagesFromInbox(user, callback);
        remoteDataSource.getMessagesFromInbox(user, callback);
    }

    @Override
    public void removeInboxMessageListener(User user) {
        localDataSource.removeInboxMessageListener(user);
        remoteDataSource.removeInboxMessageListener(user);
    }
}
