import setuptools

setuptools.setup(
    name="pytov",
    version="0.3.1",
    license='GNU',
    author="Yuval Rosen",
    author_email="yuv.rosen@gmail.com",
    description="Python with a larger syntax support",
    long_description=''.join(open('README.md', encoding='utf-8').readlines()),
    long_description_content_type="text/markdown",
    url="https://github.com/Yuvix25/pytov",
    packages=setuptools.find_packages(),
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: GNU General Public License v3 (GPLv3)",
        "Operating System :: OS Independent",
    ],
    python_requires='>=3.6',
    install_requires=["antlr4-python3-runtime==4.9"],

    entry_points={
        'console_scripts': [
            'pytov=pytov.pytov:run',
        ],
    },
)