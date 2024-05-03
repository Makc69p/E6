from django.urls import path
from . import views

urlpatterns = [
    path('chats/', views.ChatListView.as_view(), name='chat-list'),
    path('chats/<int:pk>/', views.ChatDetailView.as_view(), name='chat-detail'),
    path('messages/', views.MessageListView.as_view(), name='message-list'),
    path('users/', views.UserListView.as_view(), name='user-list'),
    path('users/<int:pk>/', views.UserDetailView.as_view(), name='user-detail'),
]