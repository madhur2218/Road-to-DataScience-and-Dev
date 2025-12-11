from flask import Flask 
import os
app=Flask(__name__)


@app.route('/', methods=['GET'])
def home():
    return "Hello, World!"


@app.route('/health', methods=['GET'])
def health():
    return "I am healthy!"

@app.route('/information', methods=["GET"])
def information():
    return "This is a sample Flask application."

if __name__ == '__main__':
    port = int(os.environ.get('PORT', 5000))
    app.run(host='0.0.0.0', port=port)
    app.run(debug=True)


 