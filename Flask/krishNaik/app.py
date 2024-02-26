
# import flast module
from flask import Flask
 
# instance of flask application
app = Flask(__name__)
 
# home route that returns below text when root url is accessed
@app.route("/")
def siemens():
    return "<p>i work in siemens!</p>"

@app.route("/members")
def members():
    return "<p>welcome to my YT channel members!</p>"
 
if __name__ == '__main__':  
   app.run(debug=True)