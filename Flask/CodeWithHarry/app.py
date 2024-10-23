from flask import Flask, render_template
from flask_sqlalchemy import SQLAlchemy
from datetime import datetime, timezone

# Initialize the Flask application
app = Flask(__name__)

# Configure the SQLite database
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///madhur.db'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

# Initialize the database with the app
db = SQLAlchemy(app)

# Define the TODO model
class TODO(db.Model):
    sno = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(200), nullable=False)
    desc = db.Column(db.String(500), nullable=False)
    date_created = db.Column(db.DateTime, default=datetime.now(timezone.utc))

    def __repr__(self) -> str:
        return f"{self.sno} - {self.title}"

# Define routes
@app.route("/")
def hello_world():
    todo = TODO(title="my first todo", desc = "hi hello")
    db.session.add(todo)
    db.session.commit()
    return render_template('index.html')

@app.route("/products")
def products():
    return "This is the products page"

@app.route("/cricketCoach")
def cricketCoach():
    return "This is cricketCoach page"

@app.route("/renderTemplate")
def render_template_page():
    return render_template('index.html')

# Ensure the database is created inside the application context
if __name__ == "__main__":
    with app.app_context():
        db.create_all()
    app.run(debug=True, port=8000)
