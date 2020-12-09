class ReturnIndicator(Exception):
    pass

class LineException:
    def __init__(self, file_name):
        self.file_name = file_name

    def _raise(self, line, err_type, massage):
        print(f"File '{self.file_name}' in line {line[0]}:\n  {line[1]}\n{err_type}: {massage}")
        exit()