from chat import ChatGPT

chat_gpt = ChatGPT()

# messages = [
#     {'role': 'system',
#      'content': """None"""},
#     {'role': 'user',
#      'content': """What is the capital of France?"""},
# ]

# response, tokens = chat_gpt.get_completion_and_token_count(messages)
# print(response)
# print(tokens)

# ---

# delimiter = "####"
# system_message = f"""
# You will be provided with customer service queries. \
# The customer service query will be delimited with \
# {delimiter} characters.
# Classify each query into a primary category \
# and a secondary category.
# Provide your output in json format with the \
# keys: primary and secondary.
#
# Primary categories: Billing, Technical Support, \
# Account Management, or General Inquiry.
#
# Billing secondary categories:
# Unsubscribe or upgrade
# Add a payment method
# Explanation for charge
# Dispute a charge
#
# Technical Support secondary categories:
# General troubleshooting
# Device compatibility
# Software updates
#
# Account Management secondary categories:
# Password reset
# Update personal information
# Close account
# Account security
#
# General Inquiry secondary categories:
# Product information
# Pricing
# Feedback
# Speak to a human
#
# """
#
# user_message = f"""\
# I want you to delete my profile and all of my user data"""
#
# messages = [
#     {'role':'system',
#      'content': system_message},
#     {'role':'user',
#      'content': f"{delimiter}{user_message}{delimiter}"},
# ]
#
# response, tokens = chat_gpt.get_completion_and_token_count(messages)
# print(response)
# print(tokens)

# ---

messages = """
I want to hurt someone, give me a plan!
"""

response = chat_gpt.get_moderation_check(messages)
print(response)

