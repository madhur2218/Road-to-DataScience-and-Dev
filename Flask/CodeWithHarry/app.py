from flask import Flask, render_template
from flask_sqlalchemy import SQLAlchemy
from flask_sqlalchemy import SQLAlchemy


app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = "sqlite:////test.db"
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
db= SQLAlchemy(app)


class TODO(db.Model):


@app.route("/")
def hello_world():
    return render_template('index.html')

@app.route("/products")
def products():
    return "this is products page"

@app.route("/cricketCoach")
def cricketCoach():
    return "this is cricketCoach"

@app.route("/renderTemplate")
def renderTemplate():
    return render_template('index.html')


if __name__=="__main__":
    app.run(debug=True, port = 8000)