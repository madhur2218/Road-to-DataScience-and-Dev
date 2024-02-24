import os 
from constants import openai_key
from langchain.llms.openai import OpenAI
import streamlit as st



#streamlit framework
st.title = "langchain demo with OPENAI API"
input_text = st.text_input("search the topic you want")

os.environ["OPENAI_API_KEY"] = openai_key

#Initialize openai llms
llm = OpenAI(temperature=0.8)


if input_text:
    st.write(llm(input_text))
