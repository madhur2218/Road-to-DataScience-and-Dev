# import flask module
from flask import Flask, redirect, url_for

# instance of flask application
app = Flask(__name__)

# home route that returns below text when root url is accessed
@app.route("/")
def siemens():
    return "<p>I work in Siemens!</p>"

@app.route("/members")
def members():
    return "<p>Welcome to my YouTube channel members!</p>"

@app.route("/success/<int:score>")
def success(score):
    return "<p>The score of success is: " + str(score) + "</p>"

@app.route("/failure/<int:score>")
def fail(score) :
    return "<p>The score is failure: " + str(score) + "</p>"

@app.route("/result/<int:marks>")
def result(marks):
    result = ""
    if marks > 33:
        result = "pass"
    else : 
        result = "fail"
    
    return redirect(url_for(result,score=marks))

if __name__ == '__main__':
    app.run(debug=True)
