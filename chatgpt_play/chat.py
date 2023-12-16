from openai import OpenAI
# import tiktoken
from dotenv import load_dotenv

load_dotenv()

client = OpenAI()


def get_completion_and_token_count(messages,
                                   model="gpt-3.5-turbo",
                                   temperature=0,
                                   max_tokens=500):
    response = client.chat.completions.create(model=model,
                                              messages=messages,
                                              temperature=temperature,
                                              max_tokens=max_tokens)

    token_dict = {
        'prompt_tokens': response.usage.prompt_tokens,
        'completion_tokens': response.usage.completion_tokens,
        'total_tokens': response.usage.total_tokens,
    }

    return response.choices[0].message, token_dict


message = [
    {'role': 'system',
     'content': """None"""},
    {'role': 'user',
     'content': """What is the capital of France?"""},
]

answer, token_info = get_completion_and_token_count(message)

print(answer)
print(token_info)
