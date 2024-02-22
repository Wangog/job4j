from django.shortcuts import render
from django.http import HttpResponse

def my_website(request):
return HttpResponse('Hello, World!')
