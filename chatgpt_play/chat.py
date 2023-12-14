import os
from openai import OpenAI
import tiktoken
from dotenv import load_dotenv
load_dotenv()

client = OpenAI()


def get_completion(prompt, model="gpt-3.5-turbo"):

    messages = [{"role": "user", "content": prompt}]
    response = client.chat.completions.create(model=model,
    messages=messages,
    temperature=0)
    return response.choices[0].message


answer = get_completion("What is the capital of France?")

print(answer)
