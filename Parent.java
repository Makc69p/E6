function sendMessage(message, chatId) {

 console.log(`Sending message: ${message} to chat: ${chatId}`);
}

// Функция получения сообщений из чата
function getMessages(chatId) {
 // Логика получения сообщений из указанного чата
 console.log(`Getting messages from chat: ${chatId}`);
}

// Функция создания группового чата
function createGroupChat(chatName, members) {
 // Логика создания группового чата с указанными участниками
 console.log(`Creating group chat: ${chatName} with members: ${members}`);
}

// Функция редактирования группового чата
function editGroupChat(chatId, newChatName) {
 // Логика редактирования названия группового чата
 console.log(`Editing group chat: ${chatId} with new name: ${newChatName}`);
}

// Функция удаления группового чата
function deleteGroupChat(chatId) {
 // Логика удаления группового чата
 console.log(`Deleting group chat: ${chatId}`);
}

// Функция редактирования личной информации пользователя
function editUserProfile(name, avatar) {
 // Логика отправки запроса на сервер для обновления информации пользователя
 console.log(`Editing user profile - name: ${name}, avatar: ${avatar}`);
}

// Функция получения списка других пользователей
function getUsersList() {
 // Логика получения списка пользователей с сервера
 console.log('Getting list of other users');
}

// Функция отправки сообщения другому пользователю
function sendMessageToUser(userId, message) {
 // Логика отправки сообщения конкретному пользователю
 console.log(`Sending message: ${message} to user: ${userId}`);
}
