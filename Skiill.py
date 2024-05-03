from django.db import models

class Chat(models.Model):
    name = models.CharField(max_length=100)

class Message(models.Model):
    chat = models.ForeignKey(Chat, on_delete=models.CASCADE)
    sender = models.CharField(max_length=50)
    content = models.TextField()

class User(models.Model):
    name = models.CharField(max_length=50)
    avatar = models.URLField()